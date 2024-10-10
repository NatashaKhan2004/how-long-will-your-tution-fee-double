public class fee {
    public static void main(String[] args) {
        double tuitionFee = 1000;     
        double targetFee = tuitionFee * 2; 
        double annualIncreaseRate = 0.07;  
        int years = 0;  

        
        while (tuitionFee < targetFee) {
            tuitionFee += tuitionFee * annualIncreaseRate; 
            years++; 
        }

        System.out.println("It will take " + years + " years to double the tuition fee.");
    }
}
