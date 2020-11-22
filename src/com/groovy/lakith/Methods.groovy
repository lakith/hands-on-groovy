package com.groovy.lakith

int sumNumbers(int x = 3, int y) {
	x + y
}

result = sumNumbers 5
println result

void display(Map productDetails) {
	println productDetails.name
	println productDetails.price
}

display price:1000, name:'Iphone'