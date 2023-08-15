// const tax = new Array();

// tax.push('array');
// tax.push('array2');
// tax.push('array3');

// tax.unshift('node');
// tax.pop();
// tax.forEach((obj)=>{
//     console.log(obj);
// })


const values = [10,20,30,40,50,60];
function get(a,b,c, ...values){
    console.log(`지금 하는 값은 ${a}`);
    console.log(`지금 하는 값으로 나온 값은 ${b}`);
    console.log(`지금 하는 값으로 나온 값 또한 ${c}`);
    console.log(`rest로 나온 값은 ${values}`);
}

get(...values);



