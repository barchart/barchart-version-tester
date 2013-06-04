package tester.one.impl.provider;

import org.apache.commons.codec.Encoder;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.net.ftp.FTP;
import org.joda.time.DateTime;

import tester.one.api.consumer.ListenerProvider;

public class HiddenEncoder implements Encoder {

	@Override
	public Object encode(final Object source) throws EncoderException {

		new DateTime();

		new ListenerProvider();

		new FTP();

		// TODO Auto-generated method stub
		return null;
	}

}
