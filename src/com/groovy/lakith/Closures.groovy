package com.groovy.lakith

c = {
	n = 2 -> println(n % 2 == 0 ? "even" : "odd")
}

c.call(3);

4.times { n -> println(n) }

4.times { println it }