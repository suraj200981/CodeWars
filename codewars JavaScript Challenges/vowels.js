function sortVowels(s){
    var paramString= "";
    paramString = String(s);
    var i;
    var newString= "";

    String.prototype.isNumber = function(){return /^\d+$/.test(this);}


    if((paramString.isNumber()==true)||s==null){
        return '';
    }
    else{

    for(i=0;i<=paramString.length-1;i++){

        if((i==paramString.length-1)&& (paramString.charAt(i).toLowerCase()=="a" || paramString.charAt(i).toLowerCase()=="e" || paramString.charAt(i).toLowerCase()=="i" || paramString.charAt(i).toLowerCase()=="o" || paramString.charAt(i).toLowerCase()=="o" || paramString.charAt(i).toLowerCase()=="u")){
            newString += "|"+paramString.charAt(i);
        }
        else if(i==paramString.length-1){
            newString += paramString.charAt(i)+"|";

        }
        else if(paramString.charAt(i).toLowerCase()=="a" || paramString.charAt(i).toLowerCase()=="e" || paramString.charAt(i).toLowerCase()=="i" || paramString.charAt(i).toLowerCase()=="o" || paramString.charAt(i).toLowerCase()=="o" || paramString.charAt(i).toLowerCase()=="u"){
            newString += "|"+paramString.charAt(i)+"\n";

        }
        else{
            newString +=paramString.charAt(i)+"|"+"\n";

        }
    
    }

    return newString;
}
      
  }


  console.log(sortVowels("Rnd Te5T"));