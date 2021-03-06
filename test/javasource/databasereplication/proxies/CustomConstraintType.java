// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public enum CustomConstraintType
{
	Static_Constraint(new String[][] { new String[] { "nl_NL", "Statisch" }, new String[] { "en_US", "Static" }, new String[] { "en_GB", "Static" }, new String[] { "en_ZA", "Static" } }),
	Dynamic_Constraint(new String[][] { new String[] { "nl_NL", "Dynamisch" }, new String[] { "en_US", "Dynamic" }, new String[] { "en_GB", "Dynamic" }, new String[] { "en_ZA", "Dynamic" } });

	private java.util.Map<String,String> captions;

	private CustomConstraintType(String[][] captionStrings)
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
