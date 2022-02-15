package ke.go.moh.oec.dfpm;

import ke.go.moh.oec.fpm.*;

import java.awt.image.BufferedImage;

public class DummyFingerprintManager implements FingerprintManager {

	public DummyFingerprintManager() throws MissingFingerprintManagerImpException {
		throw new MissingFingerprintManagerImpException("Not supported!");
	}

	@Override
	public void destroy() throws FingerprintManagerException {

	}

	@Override
	public FingerprintManagerMetadata getMetaData() {
		return null;
	}

	@Override
	public byte[] getData() {
		return new byte[0];
	}

	@Override
	public int getQuality() {
		return 0;
	}

	@Override
	public boolean identify(Object template) {
		return false;
	}

	@Override
	public boolean verify(Object template1, Object template2) {
		return false;
	}

	@Override
	public void onSensorPlug(String sensorId) {

	}

	@Override
	public void onSensorUnplug(String sensorId) {

	}

	@Override
	public void onFingerDown(String sensorId) {

	}

	@Override
	public void onFingerUp(String sensorId) {

	}

	@Override
	public void onImageAcquired(String sensorId, BufferedImage fingerprintImage) {

	}

	@Override
	public void setFingerprintingComponent(FingerprintingComponent fingerprintingComponent) {

	}
}
