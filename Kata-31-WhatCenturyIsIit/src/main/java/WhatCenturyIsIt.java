public class WhatCenturyIsIt {

    public WhatCenturyIsIt() {
    }

    public static String whatCentury(int year) {
      // coding here
      String century =  String.valueOf(year).substring(1, 4).equals("000")?  String.valueOf(Integer.parseInt(String.valueOf(year).substring(0, 2))):String.valueOf(Integer.parseInt(String.valueOf(year).substring(0, 2))+1); 
      int second = Integer.parseInt(century.substring(1, 2));

      if((Integer.parseInt(century)+1) > 20){
        if(second==1){
            century+="st";
        }else if(second==2){
            century +="nd";
        }else if(second==3){
            century += "rd";
        }else{
            century += "th";
        }
      }else{
        century+="th";
      }
      return century;
    }
}
