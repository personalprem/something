package main

import java.io.FileInputStream
import java.io.IOException
import java.io.BufferedInputStream
import java.nio.charset.Charset
import java.io.File

class MainLayout {

	fun testFunction() {

		println("Hai... This is a test function...")
		val newBIS = BufferedInputStream(FileInputStream(File("main/Landing.kt")))
		//newBIS.


	}

	fun testFileReading() {
	    val fileContent = "ccc";   //File.readLines("Laning.kt");
	    

	  //  val fileContent = main.MainLayout::class.java.getResource("LandxxxxxxingKt.class").readText()
		println(fileContent)


	}

//	fun  File.readLines(
//			charset: Charset = Charsets.UTF_8
//	): List<String> (source){
//		
//	}

}