

class Add{

    public void add(int...a)
    {
        int sum = 0;
        String temp = "";
        for(int i: a)
        {
            
            sum+= i;
            temp += i + "+";
        }
        temp = temp.substring(0,temp.length()-1)+"="+sum;
        System.out.println(temp);
        
    }
}