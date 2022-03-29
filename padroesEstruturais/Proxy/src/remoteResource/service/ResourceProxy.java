package remoteResource.service;

public class ResourceProxy implements Resource {
	private Resource realResource;
	private String validToken = "v@l1d!";
	private String tokenProvided;
	
	public ResourceProxy(String tokenProvided) {
		this.tokenProvided = tokenProvided;
	}
	
	public String getData() {
		if(!tokenProvided.equals(validToken)) return "Invalid Token";
		if(realResource == null) {
			try {
				realResource = new ResourceImp();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return realResource.getData();
	}
	
}
