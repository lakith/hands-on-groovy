/**
 * 
 */
package com.groovy.lakith

/**
 * @author lmuthugala
 *
 */

float a = 10.5F

println a
println a.class

s = 'hello'
println s

name = 'lakith'
s= "My name is ${name}"
println s

s='''
It dosen't matter if you win by an inch or a mile.
Wining is winning
'''

println(s)

emailPattern = /[\w-\.]+@([\w-]+\.)+[\w-]{2,4}/
println emailPattern.getClass();
println "lakith1995@gmail.com" ==~ emailPattern