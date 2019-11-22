function add(a) {
    var sum = 0;
    for(var i = 0;i<a.length;i++){
        sum = a[i]+sum;
    } 
    console.log('The Sum Of Elements In Array Is:',sum);
}
var a = [10,20,30];
add(a);

var add = function(a){
    var sum = 0;
    for(var i = 0;i<a.length;i++){
        sum = a[i]+sum;
    }
    console.log('The Sum Of Elements In Array Is:',sum);
    return sum;
}
var a = [10,20,30];
var result = add(a);


var a = [10,20,30];
(function(a){
    var sum = 0;
    for(var i = 0;i<a.length;i++){
        sum = a[i]+sum;
    } 
    console.log('The Sum Of Elements In Array Is:',sum); 
})(a);

var a = [10,20,30];
var array = (a) => {
    var sum = 0;
    for(var i = 0;i<a.length;i++){
        sum = a[i]+sum;
    }
console.log('The Sum Of Elements In Array Is:',sum);
}
array(a);