package tester.one.api;

import aQute.bnd.annotation.ConsumerType;

import com.barchart.util.anno.SemanticConsumerApi;

@ConsumerType
@SemanticConsumerApi
public interface Listener {

	void listen();

}
