package com.groovy.lakith

LinkedList list = [1, 2, 3]
println list
println list.class


list << 4
println list


list += [5, 6]
println list

list.each { print it }
list.reverseEach { print it }
list.eachPermutation { println it }

s = ['javascript', 'react', 'node.js', 'java']
println s

m = [name:'lakith', age:25, married: false]
println m

m.each { 
	k, v -> 
		print k + ' '
		print v
		print '\n'
}

println m.name
println m['name']
println m.get('name')

m.weight = '100'

println m.get('weight')