package Polymorphism_Overriding;

public class BMW2 extends Car1 {

	// Poly--( many) Morphism(forms)
	// Method Overrididng ---also called Run Time/Dynamic PolyMorphism
	// (1).Rule already defined when ever we override a method It is Run time
	// Polymorphism

	// (2).because child class Overridden method called --- Jvm will decide at
	// runtime Only decided => which method to call

	// Method Overriding: 3 Rules this is also Called Poly+morphism
	// Method Overriding always happen between Parent & Child
	// Method name Should be same name & Same no of parameters
	// return type also same

	// Q1:Is this is below method Overriding? having different param
	// Car class having strat(int a) BMW havig strat()
	// A: No

	// Q2:How will u check this method satisfyig all overriding rules ?
	// A: There is one Annotation there is no compulsory to write simple write
	// @override
	// This @override will not give any error then it will follow all rules
	// See the Green Symbol here this is over_ridden method

	// Q3:Note:- Private final static ... not supported overidden
	// Note: **Static methods are overloaded but cann't overrided
	@Override
	public void start() {
		System.out.println("BMW ---START method called");
	}

	public void autparking() {

		System.out.println("BMW ---AutoPark");
	}

}
