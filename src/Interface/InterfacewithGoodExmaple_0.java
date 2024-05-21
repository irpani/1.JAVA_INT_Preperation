package Interface;

public class InterfacewithGoodExmaple_0 {

	/***
	 * Interface: ------------- General Idea What Interface is I will Explain in
	 * nutshell? Interface is a Contract between Client And Devoloper for Example
	 * Suppose I have Banking Application having 4 modules 1.Saving Account 2.Fixed
	 * Deposit 3.Recurring Deposit Account 4.Gold Loan
	 * 
	 * There is a Chance that these modules will devoloped by Different diff
	 * Devolopers Diff Diff Company's also There is a Chance so what I want Iwant
	 * there are some MethodsSome 20 Methods I have these 20 Methodes should same
	 * Across all Modules here Devoloper Override these methods start writing
	 * Implementaion for these methods like @override the logic
	 * 
	 * 
	 * these 20 method prototype is Common for Multiple subclasses So If u want to
	 * Centralize Common Method Prototype then u can write inside the Interface So
	 * Interface Contains Common Method Prototype These Interface Implemented By
	 * Multiple Subclasses
	 * 
	 * 1.Deposit() 2.withDraw() 3.Check Balance() 4.get Deposit() 5.getStatement() .
	 * .
	 * 
	 * and so on
	 * 
	 * 20 Mehtods
	 */

	/*****
	 * Abstarct Class: ---------------- In Abstarct Method u can write Concrete
	 * Method and Abstarsct Method also ,Now y to WRITE Concrete Method? There are
	 * Some Situations there multiple Subclasses have method behabiour is Common
	 * suppose PrintStatement() is there its responsibility to take the AccoutNumber
	 * and Print the Statement , Suppose this method behaviour is Common in all the
	 * subclasses then y to write the method body in all the subclasses It leads to
	 * Code Duplicattion Problem In future u want to Change All the Subclasses u
	 * have to modify better what we can do write that Common Method behaviour here
	 * in the Abstract Class So in 1 line we can say Interface contains the Common
	 * Method Prototype Abstract Class Contains the Common method Behaviour and
	 * Concrete Class Contains a Specific method behaviour
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
