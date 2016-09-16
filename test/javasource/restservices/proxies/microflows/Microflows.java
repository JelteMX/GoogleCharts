// This file was generated by Mendix Modeler 6.8.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package restservices.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the RestServices module
	public static void aCo_ServiceDefinition(IContext context, restservices.proxies.DataServiceDefinition _serviceDefinition)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ServiceDefinition", _serviceDefinition == null ? null : _serviceDefinition.getMendixObject());
			Core.execute(context, "RestServices.ACo_ServiceDefinition", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean bDe_ServiceDefinition(IContext context, restservices.proxies.DataServiceDefinition _dataServiceDefinition)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("DataServiceDefinition", _dataServiceDefinition == null ? null : _dataServiceDefinition.getMendixObject());
			return (Boolean)Core.execute(context, "RestServices.BDe_ServiceDefinition", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void createMicroflowService(IContext context, String _microflowName, String _securityRole, String _description, restservices.proxies.HttpMethod _httpMethod)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("MicroflowName", _microflowName);
			params.put("SecurityRole", _securityRole);
			params.put("Description", _description);
			params.put("HttpMethod", _httpMethod == null ? null : _httpMethod.name());
			Core.execute(context, "RestServices.CreateMicroflowService", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void createMicroflowServiceWithPath(IContext context, String _microflowName, String _securityRole, String _description, String _pathTemplate, restservices.proxies.HttpMethod _httpMethod)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("MicroflowName", _microflowName);
			params.put("SecurityRole", _securityRole);
			params.put("Description", _description);
			params.put("PathTemplate", _pathTemplate);
			params.put("HttpMethod", _httpMethod == null ? null : _httpMethod.name());
			Core.execute(context, "RestServices.CreateMicroflowServiceWithPath", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static restservices.proxies.DataServiceDefinition getOrCreateDataService(IContext context, String _serviceName)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ServiceName", _serviceName);
			IMendixObject result = (IMendixObject)Core.execute(context, "RestServices.GetOrCreateDataService", params);
			return result == null ? null : restservices.proxies.DataServiceDefinition.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DeleteFeed(IContext context, restservices.proxies.DataSyncState _followChangesState)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("FollowChangesState", _followChangesState == null ? null : _followChangesState.getMendixObject());
			Core.execute(context, "RestServices.IVK_DeleteFeed", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_OpenServiceOverview(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "RestServices.IVK_OpenServiceOverview", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_RebuildIndex(IContext context, restservices.proxies.ChangeLog _index)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Index", _index == null ? null : _index.getMendixObject());
			Core.execute(context, "RestServices.IVK_RebuildIndex", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SaveServiceDefinition(IContext context, restservices.proxies.DataServiceDefinition _serviceDefinition)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ServiceDefinition", _serviceDefinition == null ? null : _serviceDefinition.getMendixObject());
			Core.execute(context, "RestServices.IVK_SaveServiceDefinition", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean startPublishServices(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			return (Boolean)Core.execute(context, "RestServices.StartPublishServices", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static restservices.proxies.TrackingState vA_GetTrackingState(IContext context, restservices.proxies.DataSyncState _followChangesState)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("FollowChangesState", _followChangesState == null ? null : _followChangesState.getMendixObject());
			String result = (String)Core.execute(context, "RestServices.VA_GetTrackingState", params);
			if (result == null)
				return null;
			return restservices.proxies.TrackingState.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static Long vA_ObjectIndexNrOfConnections(IContext context, restservices.proxies.ChangeLog _serviceObjectIndex)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ServiceObjectIndex", _serviceObjectIndex == null ? null : _serviceObjectIndex.getMendixObject());
			return (Long)Core.execute(context, "RestServices.VA_ObjectIndexNrOfConnections", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}