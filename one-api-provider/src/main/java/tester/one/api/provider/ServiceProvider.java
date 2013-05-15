package tester.one.api.provider;

import tester.one.api.Listener;
import tester.one.api.Service;

/**
 * Most changes in this class are incompatible. See below.
 */
public class ServiceProvider implements Service {

	protected void bind(final Listener listerner) {
	}

	@Override
	public void process_1() {
	}

	@Override
	public void process_2() {
	}

	@Override
	public void process_3() {
	}

	@Override
	public void process_4() {
	}

	@Override
	public void process_5() {
	}

	/**
	 * Changes in public method of non-IMPL package need MINOR version change.
	 */
	public void publicMethodXXX() {

	}

	/**
	 * Changes in package-private method are compatible.
	 */
	/* default */void hiddenMethod() {

	}

	@Override
	public void process_7() {
		// TODO Auto-generated method stub

	}

}
