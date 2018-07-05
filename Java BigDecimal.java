        //Write your code here


  for (int i = 0; i < n; i++) {
        for (int j = 1; j < (n - i); j++)  {
         String temp="";
         if(new BigDecimal(s[j-1]).compareTo(new BigDecimal(s[j])) < 0) {
             temp = s[j-1];
            s[j-1] = s[j];
            s[j] = temp;
         }
      }
  }