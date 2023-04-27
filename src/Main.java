public class Main {
    public static void main(String[] args) {
        String first = "III";
        String second = "LVIII";
        String third = "MCMXCIV";
        System.out.println(first + " = " + ConvertToInteger(first));
        System.out.println(second + " = " + ConvertToInteger(second));
        System.out.println(third + " = " + ConvertToInteger(third));

    }

    public static Integer ConvertToInteger(String romeNumber){
      int  privios = 0, sum = 0;
      char symbol = 0;
        for(int j = 0;j < romeNumber.length(); j++){
            privios = symbol;
            symbol = romeNumber.charAt(j);
          switch(symbol){
              case 'I':
                  sum ++;
                  break;
              case 'V':
                  if(privios == 'I'){
                      sum += 3;
                  }else{
                      sum += 5;
                  }
                  break;
              case 'X':
                  if(privios == 'I'){
                      sum += 8;
                  }else{
                      sum += 10;
                  }
                  break;
              case 'L':
                  if(privios == 'X'){
                      sum += 30;
                  }else{
                      sum += 50;
                  }
                  break;
              case 'C':
                  if (privios == 'X') {
                      sum += 80;
                  }else{
                      sum += 100;
                  }
                  break;
              case 'D':
                  if(privios == 'C'){
                      sum += 300;
                  }else{
                      sum += 500;
                  }
                  break;
              case 'M':
                  if(privios == 'C'){
                      sum += 800;
                  }else{
                      sum += 1000;
              }
                  break;
          }
      }
        return sum;
    }
}