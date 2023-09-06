package Input_Output_Streams;

public class WhatisTheUseOfTrasinetAndStaticInSerialization {

	/****
	 * 
	 * When we are using transient static member means
	 * 
	 * Object State Save to the file is called Serailization Object State means
	 * Always instance Variable Static data means Only one memory will be allocated
	 * Scope at class level So It will not particiated in Serailization In the Case
	 * Of transient like mul variables we have all are instance type some Variables
	 * I don't want to Serialize in this Case marked as transient So when ever we
	 * are using trasient then that variable will not participate in Serialization
	 * Now u are asking the Difference
	 *
	 *
	 * Serialization String str ="Jdbc"; trasient int x =10;
	 * 
	 * DeSerialization : When I do DeSerialization I get jdbc but where as x value I
	 * will get Default VALUE,for static I will get Class levedata This is the main
	 * Difference between Transient and static ...
	 * 
	 * 
	 * 
	 */

}
