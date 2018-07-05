    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        if(a.length() != b.length()){
            return false;
        }
        
        char [] ch = a.toLowerCase().toCharArray();
        char [] ch1 = b.toLowerCase().toCharArray();
        
        for(int i = 0; i < ch.length;i++ )
        {
            char temp = a.charAt(i);
            int count=0;int count1=0;
          for(int j=0;j<ch.length;j++)
          {
              if(temp==ch[j])
                  count++;
              if(temp == ch1[j])
                    count1++;
          }
            if(count!= count1)
                return false;
            
         }
           return true;
        
        
        
    }