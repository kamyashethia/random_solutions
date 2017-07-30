/*
 * Complete the function below.
 */

    static String[] say_what_you_see(String[] input_strings) {
        
        String[] output_strings = new String[input_strings.length]; 
        
        for(int i =0; i<input_strings.length; i++) { 
            char[] string_chars = input_strings[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            
            //for loop that goes through string chars
            for(int j =0; j<string_chars.length; j++) {
               int count =1;
               int element = (int)string_chars[j]-48;
               
                               
               if(j+1<string_chars.length){
                   while(element == (int)string_chars[j+1]-48) {
                        
                        count++; 
                        j++;
                       if(j+1>=string_chars.length) {
                           break;
                       }
                   }
               }
                
                
               sb.append(count); 
               sb.append(element);
                
            }
            output_strings[i] = sb.toString();
        }

        return output_strings;
    }


