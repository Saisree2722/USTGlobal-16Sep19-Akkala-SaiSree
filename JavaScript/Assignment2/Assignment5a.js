function prime(num){
    var count=0;
for(var i = 1;i<=num;i++){
    if(num%i==0){
       count++;
    }
    if(count>2){
        break;
    }
} 
    if(count==2)
    {
        console.log(num,' is a prime number')
    }
    else{
        console.log(num,'is not a prime')
    }
}
prime(4);

var prime = function(num){
    var count=0;
for(var i = 1;i<=num;i++){
    if(num%i==0){
       count++;
    }
    if(count>2){
        break;
    }
} 
    if(count==2)
    {
        console.log(num,' is a prime number')
    }
    else{
        console.log(num,'is not a prime')
    }
    return num;  
} 
var result = prime(7);

(function(num)
{
    var count=0;
for(var i = 1;i<=num;i++){
    if(num%i==0){
       count++;
    }
    if(count>2){
        break;
    }
} 
    if(count==2)
    {
        console.log(num,' is a prime number')
    }
    else{
        console.log(num,'is not a prime')
    }
    return num;     
})(2);

var prime = (num)=>{
    var count=0;
for(var i = 1;i<=num;i++){
    if(num%i==0){
       count++;
    }
    if(count>2){
        break;
    }
} 
    if(count==2)
    {
        console.log(num,' is a prime number')
    }
    else{
        console.log(num,'is not a prime')
    } 
}
prime(9);