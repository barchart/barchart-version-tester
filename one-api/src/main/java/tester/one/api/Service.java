package tester.one.api;

import aQute.bnd.annotation.ProviderType;

import com.barchart.util.anno.SemanticProviderApi;

@ProviderType
@SemanticProviderApi
public interface Service {

	void process_1();

	void process_2();

	void process_3();

	void process_4();

}
