function fact(num)
    {
       var prod=1;
       for(var i=num;i>1;i--)
       {
           prod=i*prod;
          
       }
       console.log("fact",prod);
    }
    fact(5);

    var fact = function(num)
    {
        var prod=1;
       for(var i=num;i>1;i--)
       {
           prod=i*prod;
          
       }
       console.log("fact",prod);
       return prod;
    }
    var result = fact(5);

   (function(num){
    var prod=1;
       for(var i=num;i>1;i--)
       {
           prod=i*prod;
          
       }
       console.log("fact",prod);
       return prod; 
   })(7)
   
   var fact = (num)=>{
    var prod=1;
       for(var i=num;i>1;i--)
       {
           prod=i*prod;
          
       }
       console.log("fact",prod); 
   }
   fact(3);