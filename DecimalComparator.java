public class DecimalComparator{
    
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo){
        
        int firstNum = (int)(1000 * numOne - Math.round(numOne));
        int secondNum = (int)(1000 * numTwo - Math.round(numTwo));
        
    
        if (firstNum == secondNum){
            return true;
        } else {
         return false;
        }
    }
}
