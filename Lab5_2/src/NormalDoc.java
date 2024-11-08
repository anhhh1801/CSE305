
public class NormalDoc implements DocumentBuilder {
	
	private String extension;
	private String encryption;
	
	
	@Override
	public DocumentBuilder setExtension(String extension) {
		this.extension = extension;
		return this;
	}

	@Override
	public DocumentBuilder setEncryption(String encryption) {
		this.encryption = encryption;
		return this;
	}

	@Override
	public Document buildDoc() {
		return new Document(extension, encryption);
	}

}
