// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

public enum PersistenceType
{
	Persistable(new String[][] { new String[] { "en_US", "Persistable" }, new String[] { "nl_NL", "Persistent" }, new String[] { "en_GB", "Persistable" }, new String[] { "en_ZA", "Persistable" } }),
	Non_persistent(new String[][] { new String[] { "en_US", "Non-persistent" }, new String[] { "nl_NL", "Niet peristent" }, new String[] { "en_GB", "Non-persistent" }, new String[] { "en_ZA", "Non-persistent" } });

	private java.util.Map<String,String> captions;

	private PersistenceType(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
