//package cn.gooday.logistics.common.rest;
//
//import com.fasterxml.jackson.databind.JavaType;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.type.MapType;
//import com.fasterxml.jackson.databind.type.TypeFactory;
//import org.springframework.core.MethodParameter;
//import org.springframework.web.bind.ServletRequestBindingException;
//import org.springframework.web.context.request.NativeWebRequest;
//import org.springframework.web.method.annotation.AbstractNamedValueMethodArgumentResolver;
//
//import javax.servlet.ServletException;
//import javax.servlet.ServletInputStream;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//import java.lang.reflect.ParameterizedType;
//import java.lang.reflect.Type;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//public class JsonParamMethodArgumentResolver extends
//		AbstractNamedValueMethodArgumentResolver {
//
//	private ObjectMapper mapper = new ObjectMapper();
//
//	public JsonParamMethodArgumentResolver() {
//		super(null);
//	}
//
//	public boolean supportsParameter(MethodParameter parameter) {
//
//		if (parameter.hasParameterAnnotation(JsonParam.class)) {
//			return true;
//		}
//		return false;
//	}
//
//	@Override
//	protected NamedValueInfo createNamedValueInfo(MethodParameter parameter) {
//		JsonParam annotation = parameter
//				.getParameterAnnotation(JsonParam.class);
//		return new RequestJsonParamNamedValueInfo(annotation);
//
//	}
//
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@Override
//	protected Object resolveName(String name, MethodParameter parameter,
//			NativeWebRequest webRequest) throws Exception {
//		String[] paramValues = webRequest.getParameterValues(name);
//		Class<?> paramType = parameter.getParameterType();
//		if (paramValues == null) {
//
//			HttpServletRequest req = (HttpServletRequest) webRequest
//					.getNativeRequest();
//			String paramValue = this.getRequestPayload(req);
//			if (null == paramValue || "".equals(paramValue)) {
//				return null;
//			}
//			JavaType javaType = getJavaType(paramType);
//			if (Collection.class.isAssignableFrom(paramType)) {
//				Type type = parameter.getGenericParameterType();
//				javaType = javaType.narrowContentsBy((Class<?>) ((ParameterizedType) type).getActualTypeArguments()[0]);
//				return mapper.readValue(paramValue, javaType);
//			}
//
//			return mapper.readValue(paramValue, paramType);
//		}
//
//		try {
//			if (paramValues.length == 1) {
//				String text = paramValues[0];
//				Type type = parameter.getGenericParameterType();
//
//				if (MapWapper.class.isAssignableFrom(paramType)) {
//					MapWapper<?, ?> jsonMap = (MapWapper<?, ?>) paramType
//							.newInstance();
//
//					MapType mapType = (MapType) getJavaType(HashMap.class);
//
//					if (type instanceof ParameterizedType) {
//						mapType = (MapType) mapType
//								.narrowKey((Class<?>) ((ParameterizedType) type)
//										.getActualTypeArguments()[0]);
//						mapType = (MapType) mapType
//								.narrowContentsBy((Class<?>) ((ParameterizedType) type)
//										.getActualTypeArguments()[1]);
//					}
//					jsonMap.setInnerMap(mapper.<Map> readValue(text, mapType));
//					return jsonMap;
//				}
//
//				JavaType javaType = getJavaType(paramType);
//
//				if (Collection.class.isAssignableFrom(paramType)) {
//					javaType = javaType
//							.narrowContentsBy((Class<?>) ((ParameterizedType) type)
//									.getActualTypeArguments()[0]);
//				}
//
//				return mapper.readValue(paramValues[0], javaType);
//			}
//
//		} catch (Exception e) {
//			throw new JsonMappingException(
//					"Could not read request json parameter", e);
//		}
//
//		throw new UnsupportedOperationException(
//				"too many request json parameter '" + name
//						+ "' for method parameter type [" + paramType
//						+ "], only support one json parameter");
//	}
//
//	protected JavaType getJavaType(Class<?> clazz) {
//		return TypeFactory.defaultInstance().uncheckedSimpleType(clazz);
//	}
//
//	@Override
//	protected void handleMissingValue(String paramName,
//			MethodParameter parameter) throws ServletException {
//		String paramType = parameter.getParameterType().getName();
//		throw new ServletRequestBindingException(
//				"Missing request json parameter '" + paramName
//						+ "' for method parameter type [" + paramType + "]");
//	}
//
//	private class RequestJsonParamNamedValueInfo extends NamedValueInfo {
//
//		private RequestJsonParamNamedValueInfo() {
//			super("", false, null);
//		}
//
//		private RequestJsonParamNamedValueInfo(JsonParam annotation) {
//			super(annotation.value(), annotation.required(), null);
//		}
//	}
//
//	private String getRequestPayload(HttpServletRequest req) {
//		StringBuilder sb = new StringBuilder();
//		try {
//			ServletInputStream in = req.getInputStream();
//
//			byte[] buff = new byte[1024];
//			int len;
//			while ((len = in.read(buff)) != -1) {
//				sb.append(new String(buff, 0, len));
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return sb.toString();
//	}
//}