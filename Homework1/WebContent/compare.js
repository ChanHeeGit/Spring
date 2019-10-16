function CompareCreditNumber(){
		if(document.orderform.creditnum.value != document.orderform.creditnum2.value){
			alert('Credit Card Number 불일치');
			document.orderform.creditnum.value="";
			document.orderform.creditnum2.value="";
			document.orderform.creditnum.focus();
			return false;
		}
	}