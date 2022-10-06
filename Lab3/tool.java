package Lab3;

// Function that transform string input to array of doubles
public class tool {
    public static double[] string2array(String str, String sep){
        String [] arr = str.split(sep);
        int n = arr.length;
        double [] new_arr = new double[n];
        for(int i=0; i<n; i++){
            new_arr[i] = Double.parseDouble(arr[i]);
        }
        return new_arr;

    }
}
