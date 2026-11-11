//console.log(Boolean(-1))

/*let paymentAmount=500000
let walletBalance=800000
let isActive=true
if (isActive && paymentAmount>0 && walletBalance> paymentAmount)
{
	console.log("payment successful")
}
else {
	console.log("payment failed")
}*/


/*let email="   "

if (!email.trim()){
	console.log("email is required")
}
else {
	console.log("email received")
}*/



/*let walletBalance=750000 ;
if (walletBalance>=1000000){
	console.log("gold")
}
else if (walletBalance>=500000){
	console.log("silver")
}
else if (walletBalance>0 ){
	console.log("bronz")
}
else {
	console.log("empty")
}
*/

/*let walletBalance=[100000,500000,630000,8500000,1500000]
console.log(walletBalance.length)
for(let i=0;i<walletBalance.length;i++) {
    console.log(walletBalance[i])
}*/

/*
for(let i=0;i<5;i++) {
    console.log(i)
}
*/

/*let counter=0
while (counter<5) {
                 console.log(counter)
    counter++

}*/

//tamrin
/*
for(let i=0 ; i<=10 ; i++){
    console.log(i)
}
//raveshe1
let walletBalance=[500000,1200000,300000,800000,2000000]
for (let i=0 ; i<walletBalance.length ; i++){
    console.log(walletBalance[i])
}

//raveshe2
let walletBalance=[500000,1200000,300000,800000,2000000]
for(let balance of walletBalance){
    console.log(balance)
}



let walletBalance=[500000,1200000,300000,800000,2000000]
let totalbalance=0
let counter=0
while(counter<walletBalance.length){
    totalbalance=totalbalance+walletBalance[counter]
    counter++
}
console.log(totalbalance)
*/

/*let walletBalance=[500000,1200000,300000,800000,2000000]
for( let i=0 ; i<walletBalance.length ; i++){
    if (walletBalance[i]>=1000000){
        console.log(walletBalance[i])
    }
}

let counter=1
while(counter<=5){
    console.log(counter)
    counter++
}
*/


/*function calculatesum(number1,number2){
    console.log(number1+number2)
}
calculatesum(15,20)*/

/*function calculatesum(number1,number2){
    return number1+number2
}
let result=calculatesum(100,200)
console.log(result)

function calculatesum(number1,number2){
    console.log(number1+number2) 
}
let result=calculatesum(100,200)
console.log(result)*/

/*function checkpayment(walletBalance,paymentAmount){
    if (paymentAmount<= 0){
        return false
    }
    if (walletBalance>=paymentAmount){
        return true
    }
    return false
}
let paymentResult=checkpayment(100000,890000)
if (paymentResult){
    console.log("payment successful")
}
else{
    console.log("payment failed")
}*/


/*let walletBalance=[500000,1200000,300000,800000,2000000]
for(let balance of walletBalance){
    if(balance>=1000000){
        console.log(balance)
    }
}*/



//diffrence between for...of and for...in
/*let users=["sara","ali","reza","mina"]
for(let user of users){
    console.log(user)
}

for(let user in users){
    console.log(user)
}

let walletbalances=[200000,700000,1500000,300000,900000]
for (let balance of walletbalances) {
    if (balance>500000){
        console.log(balance)}
}
*/



//raveshe1:
/*let walletbalances=[500000,1200000,2000000,300000,800000]
let totalbalance=0
for (let balance of walletbalances){
    totalbalance=totalbalance+balance 
}
  console.log(totalbalance)


//ravesh2 ba function
  function calculatetotalbalance(walletbalances){
    let total=0
    for (let balance of walletbalances){
        total+=balance
    }
    return total
  }
  let walletbalances=[500000,1200000,2000000,300000,800000]
  let result=calculatetotalbalance(walletbalances)
  console.log(result)*/


   //arrow function
   /*const sum=(a,b)=>{
        return(a+b)
   }
   console.log(sum(1,2))*/
   
   
   

   /*function sayHello(name){
        return("hello "+name)
   }
   console.log(sayHello("sara"))

   //raveshe1
   function calculatePrice(price,discount){
        return(price-discount)
   }
   console.log(calculatePrice(1000000,200000))

   //raveshe2
   const calculateprice=(price,discount)=>(price-discount)
   console.log(calculateprice(1000000,200000))


   //raveshe1
   function checkWallet(walletBalance,paymentAmount){
        if (walletBalance>=paymentAmount){
            return(true)
        }
        else{
            return(false)
        }
   }
   console.log(checkWallet(800000,500000))

   //raveshe2
  function checkWallet(walletBalance,paymentAmount){
    return walletBalance>=paymentAmount
  }




let walletBalances=[500000,1200000,300000,800000]

function calculateTotalBalance (walletBalances){
    let result=0
    for(let balance of walletBalances){
        result+=balance
    }
    return result
}
console.log(calculateTotalBalance(walletBalances))



const multiply=(a,b)=>a*b
console.log(multiply(5,10))*/



/*function calculateDiscount(price,discountpercent){
    let discountAmount=price*(discountpercent)/100
    let result=price-discountAmount
    return(result)
}
console.log(calculateDiscount(100000,10))
console.log(calculateDiscount(100000,20))
*/
