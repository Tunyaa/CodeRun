
package com.java.coderun;

public class CodeRun {

    public static void main(String[] args) {
        /*        
        1 2 4 7 11 16 22 29 37 46 56 развернуть обратно, начать с конца
         1 2 3 4  5  6  7  8  9  10 работать смассивом промежутков
         1 10
        
       1  11 20 28 35 41 46 50 53 55 56 проверять с двух сторон, каккой короче
        10  9  8  7  6  5  4  3  2  1
        10 8 6 4 2  1
        
        56 46 37 29 22 16 11 7 4 2 1
         
        1 2 4 7 11 16 22 29 37 46 56 66 75 83 90 96 101 105 108 110 111
         1 2 3 4  5  6  7  8  9  10 10 9  8  7  6  5  4    3   2   1
                            
        
        1 3 6 12 24 48 96 99
         2 3 6  12 24 48 3
         2   48
        
        
        1 2 4 7 11 16 22 29 37 46 56 66 78
         1 2 3 4  5  6  7  8  9  10 11 12
         1  2 4 6 8 10 12
        
        восходящий спадающий восходящий
        
        public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int     len     = Integer.parseInt(reader.readLine());
        int[]   nums    = stringToAryInt(reader.readLine());
        
        int result = shortestThreadPath(nums);
        
        writer.write(String.valueOf(result));
        
        reader.close();
        writer.close();
    }
        
        
        5 5 5
*/
       
       int[] ary = new int[]{1, 2, 4, 7, 11, 16, 22, 29, 37, 46, 56};
       
    }
}
