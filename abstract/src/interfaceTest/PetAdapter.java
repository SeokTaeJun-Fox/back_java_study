package interfaceTest;

//강제성을 없애기 위해 어댑터를 사용한다.
public abstract class PetAdapter implements Pet {
	@Override
	public void poop() {;}
	
	@Override
	public void sitDown() {;}
	
	@Override
	public void waitNow() {;}
}
