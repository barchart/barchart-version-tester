package tester.one.api;

import aQute.bnd.annotation.ConsumerType;

@ConsumerType
public interface Listener {

	void listen(String event);

}
