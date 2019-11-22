function circum(num){
    var r;
     var circum=2*Math.PI*num;
     console.log('circumference',circum);
 }
circum(2);

var a = function(num){
    var r;
    var circum=2*Math.PI*num;
    console.log('circumference',circum);
    //var round_value = Math.round(4.4);
    //console.log('round',round_value);
    return circum;
}
 var result = circum(2);
 console.log('result',result); 

(function circum(num){
    var r;
    var circum=2*Math.PI*num;
    console.log('circumference',circum);
})(2);

var circum = (num) =>{
    var r;
     var circum=2*Math.PI*num;
     console.log('circumference',circum); 
}
circum(4);

