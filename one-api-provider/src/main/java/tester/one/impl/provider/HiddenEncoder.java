package tester.one.impl.provider;

import io.netty.buffer.BufUtil;

import java.io.File;

import org.apache.commons.codec.Encoder;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.net.ftp.FTP;
import org.joda.time.DateTime;

import tester.one.api.consumer.ListenerProvider;

import com.barchart.conf.util.ConfigAny;
import com.barchart.util.value.api.FactoryLoader;

public class HiddenEncoder implements Encoder {

	@Override
	public Object encode(final Object source) throws EncoderException {

		new DateTime();

		new ListenerProvider();

		new FTP();

		FactoryLoader.load();

		BufUtil.release(null);

		ConfigAny.process(new File(""));

		return null;
	}

}
