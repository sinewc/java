import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javafx.application.Application; 
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField; 
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalculator extends Application {
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btCalculate = new Button("Calculate");
    private Button btSave = new Button("Save");
    private Button btLoad = new Button("Load");
    private Button btClear= new Button("Clear");
    
public static void main(String[] args){
        launch(args);
}
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
     // Create UI
    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
    gridPane.add(tfAnnualInterestRate, 1, 0);
    gridPane.add(new Label("Number of Years:"), 0, 1);
    gridPane.add(tfNumberOfYears, 1, 1);
    gridPane.add(new Label("Loan Amount:"), 0, 2);
    gridPane.add(tfLoanAmount, 1, 2);
    gridPane.add(new Label("Monthly Payment:"), 0, 3);
    gridPane.add(tfMonthlyPayment, 1, 3);
    gridPane.add(new Label("Total Payment:"), 0, 4);
    gridPane.add(tfTotalPayment, 1, 4);
    gridPane.add(btCalculate, 1, 7);
    gridPane.add(btSave, 0, 7);
    gridPane.add(btLoad, 0, 7);
    gridPane.add(btClear, 1, 7);
    

// Set properties for UI
    gridPane.setAlignment(Pos.CENTER);
    tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
    tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
    tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
    tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
    tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
    tfMonthlyPayment.setEditable(false);
    tfTotalPayment.setEditable(false);
    GridPane.setHalignment(btCalculate, HPos.RIGHT);
    GridPane.setHalignment(btClear, HPos.LEFT);
    GridPane.setHalignment(btSave, HPos.RIGHT);
    GridPane.setHalignment(btLoad, HPos.LEFT);
    
    // Process events
    btCalculate.setOnAction(e -> calculateLoanPayment());
    btClear.setOnAction(e -> clearTextField());
    btSave.setOnAction(e -> saveFile());
    btLoad.setOnAction(e -> loadFile());
    
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(gridPane, 500, 250);
    primaryStage.setTitle("LoanCalculator"); // Set title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
}

private void calculateLoanPayment() { 
    // Get values from text fields 
    double interest = Double.parseDouble(tfAnnualInterestRate.getText()); 
    int year = Integer.parseInt(tfNumberOfYears.getText()); 
    double loanAmount = Double.parseDouble(tfLoanAmount.getText());
    // Create a loan object. Loan defined in Listing 10.2
        Loan loan = new Loan(interest, year, loanAmount);
     // Display monthly payment and total payment
    tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
    tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
    }
   
    private void clearTextField(){
        tfAnnualInterestRate.setText(""); 
        tfNumberOfYears.setText("");
        tfLoanAmount.setText("");
        tfMonthlyPayment.setText("");
        tfTotalPayment.setText("");
        
    }
    
     private void saveFile() {
        try(DataOutputStream op = new DataOutputStream (new FileOutputStream("loan.det"))){
            op.flush();
            op.writeUTF(tfAnnualInterestRate.getText());     
            op.writeUTF(tfNumberOfYears.getText());  
            op.writeUTF(tfLoanAmount.getText());  
        }catch(Exception e){
            e.printStackTrace();
        }
     }
    
    private void loadFile(){
        try(DataInputStream ip = new DataInputStream (new FileInputStream("loan.det"))){
            tfAnnualInterestRate.setText(ip.readUTF()); 
            tfNumberOfYears.setText(ip.readUTF());
            tfLoanAmount.setText(ip.readUTF());
        }catch(Exception e){
              e.printStackTrace();
        }
    }

    
}