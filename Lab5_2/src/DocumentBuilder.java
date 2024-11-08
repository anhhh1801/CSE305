
public interface DocumentBuilder {
	
	DocumentBuilder setExtension (String extension);
	
	DocumentBuilder setEncryption (String encryption);
	
	Document buildDoc();
}
