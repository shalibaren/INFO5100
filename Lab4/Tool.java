package Lab4;

// Function that transform string input to array of doubles
public class Tool {
    public static double[] string2array(String str, String sep, int n){
        String [] arr = str.split(sep);
        double [] new_arr = new double[n];
        for(int i=0; i<n; i++){
            new_arr[i] = Double.parseDouble(arr[i]);
        }
        return new_arr;

    }
}
