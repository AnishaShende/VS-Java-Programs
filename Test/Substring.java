public class Substring {
    public static void main(String[] args){
        String str = "aabab"; //change string here
        int k = 3; //change integer here
        int distinct = k-1;
        int numcount = 1;
        int answer = 0;
        char tempchar;
        String[] subString = new String[str.length() * (str.length() + 1) / 2];
        int counter = 0;
        // String subString  =str.substring(0, 2);
        // String subString = str.substring(k);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length()+1; j++) {
                subString[counter] = str.substring(i, j);
                counter ++;
            }
            // subString = str.substring(i, i+1);
        }
        // for (int i = 0; i < subString.length; i++) {
        //     System.out.print(subString[i]+" ");
        //     System.out.print(subString[i].length());
        // }
        for (int i = 0; i < subString.length; i++) {
            if (subString[i].length() == k) {
                // System.out.print(subString[i]+" ");
                // System.out.println();
                for (int j = 0; j < subString[i].length(); j++) {
                    tempchar = subString[i].charAt(0);
                    // System.out.print("tempchar = "+tempchar+" ");
                    if (tempchar != subString[i].charAt(j)) {
                        numcount++;
                    }
                    // System.out.print("numcount = "+numcount+" ");
                }
                if(numcount == distinct){
                    System.out.print(subString[i]+" ");
                    answer++;
                    // System.out.println(answer);
                }
                numcount = 1;
            }
        }
        System.out.println(answer);
        // System.out.println();
        // System.out.println(subString);
    }
}
