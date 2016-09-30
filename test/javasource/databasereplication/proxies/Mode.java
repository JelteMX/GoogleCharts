// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public enum Mode
{
	Normal(new String[][] { new String[] { "en_US", "Normal" }, new String[] { "nl_NL", "Normaal" }, new String[] { "en_GB", "Normal" }, new String[] { "en_ZA", "Normal" } }),
	Advanced(new String[][] { new String[] { "en_US", "Advanced" }, new String[] { "nl_NL", "Geavanceerd" }, new String[] { "en_GB", "Advanced" }, new String[] { "en_ZA", "Advanced" } });

	private java.util.Map<String,String> captions;

	private Mode(String[][] captionStrings)
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