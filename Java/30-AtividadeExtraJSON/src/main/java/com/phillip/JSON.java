package com.phillip;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.json.CDL;
import org.json.Cookie;
import org.json.HTTP;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;
import org.json.JSONWriter;
import org.json.Property;
import org.json.XML;

@SuppressWarnings("unchecked")
public class JSON {
	// Neste método é criado um JsonObject a partir de uma String que tem uma matriz
	// usando o JsonArray
	protected static void JSONExampleArray1() {

		// Declarando o Array na String
		String arrayStr = "[" + "true," + "false," + "\"true\"," + "\"false\"," + "\"hello\"," + "23.45e-4,"
				+ "\"23.45\"," + "42," + "\"43\"," + "[" + "\"world\"" + "]," + "{" + "\"key1\":\"value1\","
				+ "\"key2\":\"value2\"," + "\"key3\":\"value3\"," + "\"key4\":\"value4\"" + "}," + "0," + "\"-1\""
				+ "]";

		// Chama o Array a partir do construtor
		JSONArray array = new JSONArray(arrayStr);
		// Mostra os valores que estão contidos no Array
		System.out.println("Values array: " + array);

		// Aqui é feito um novo Array contendo os valores do tamanho do array feito
		// anteriormente e imprimi o array
		JSONArray list = listNumberArray(array.length());
		System.out.println("Label Array: " + list.toString());

		// Aqui se constroi o JsonObject usando os valores do array anterior mais os
		// valores do primeiro array
		JSONObject object = array.toJSONObject(list);
		System.out.println("Final JSONOBject: " + object);
	}

	// Gera um JsonArray rotulado de acordo com as suas posições
	private static JSONArray listNumberArray(int max) {
		JSONArray res = new JSONArray();
		for (int i = 0; i < max; i++) {
			res.put(String.valueOf(i));
		}
		return res;
	}

	protected static void JSONExampleArray2() {

		// Criando um array vazio
		JSONArray array = new JSONArray();

		// Adicionado com .put()
		array.put("value");
		array.put(5);
		array.put(-23.45e67);
		array.put(true);

		// Convertendo o array para um objeto como o método anterior
		JSONArray list = listNumberArray(array.length());
		JSONObject object = array.toJSONObject(list);
		System.out.println("Final JSONOBject: " + object);
	}

	protected static void JSONExampleStringer() {

		// Chama o JsonStringer e adiciona elementos com o .object()
		JSONStringer jsonStringer = new JSONStringer();
		jsonStringer.object();

		// Adiciona chaves e valores com o .key() e .value()
		jsonStringer.key("trueValue").value(true);
		jsonStringer.key("falseValue").value(false);
		jsonStringer.key("nullValue").value(null);
		jsonStringer.key("stringValue").value("hello world!");
		jsonStringer.key("complexStringValue").value("h\be\tllo w\u1234orld!");
		jsonStringer.key("intValue").value(42);
		jsonStringer.key("doubleValue").value(-23.45e67);

		// finaliza o Stringer com .endObject()
		jsonStringer.endObject();

		// Finaliza transformando o JsonString em JsonObject
		String str = jsonStringer.toString();
		JSONObject jsonObject = new JSONObject(str);

		// Imprimi o JsonObject
		System.out.println("Final JSONOBject: " + jsonObject);
	}

	protected static void JSONExampleObject1() {
		// Cria um JsonObject a partir de string com construtor
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);
		System.out.println("Final JSONObject: " + example);

	}

	protected static void JSONExampleObject2() {

		// Nesse metodo cria um JSONObject sem mexer nas outras funções
		JSONObject example = new JSONObject();

		// Adiciona as chaves e valores do mesmo modo que no metodo anterior
		example.put("key", "value");

		// A primeira entrada é a chave e a segunda é o valor
		example.put("key2", 5);
		example.put("key3", -23.45e67);
		example.put("trueValue", true);

		System.out.println("Final JSONOBject: " + example);
	}

	protected static void JSONExampleObject3() {

		// Cria um Json a partir de um Map, as chaves são Strings
		Map<String, Double> map = new HashMap<String, Double>();

		map.put("key1", 1.0);
		map.put("key2", -23.45e67);

		// Cria o JSONObject
		JSONObject example = new JSONObject(map);
		System.out.println("Final JSONOBject: " + example);
	}

	protected static void JSONExamplWriter() {

		// Não entendi esse método
		StringBuilder write = new StringBuilder();
		JSONWriter jsonWriter = new JSONWriter(write);

		jsonWriter.object();

		jsonWriter.key("trueValue").value(true);
		jsonWriter.key("falseValue").value(false);
		jsonWriter.key("nullValue").value(null);
		jsonWriter.key("stringValue").value("hello world!");
		jsonWriter.key("complexStringValue").value("h\be\tllo w\u1234orld!");
		jsonWriter.key("intValue").value(42);
		jsonWriter.key("doubleValue").value(-23.45e67);

		jsonWriter.endObject();

		System.out.println("JSON: " + write.toString());

	}

	protected static void JSONExampleTokener() {

		// Não consegui rodar esse método
		String string = "this is not a valid JSON string";
		JSONTokener token = new JSONTokener(string);

		JSONObject object = new JSONObject(token);
		JSONArray array = new JSONArray(token);

		System.out.println("object");
		System.out.println("array");
	}

	// Parte 2 - Métodos de conversão

	protected static void JSONObjectToArray() {

		// Inicia um JsonObject com uma String sendo chamada
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";

		JSONObject example = new JSONObject(string);

		// Faz uma lista de chaves, semelhante ao primeiro exemplo
		JSONArray keyStrings = listNumberArray(example.length());

		// Converte para um Array com os dois os valores da chaves e os valores
		// chamandos na String
		JSONArray array = example.toJSONArray(keyStrings);

		System.out.println("Final JSONArray: " + array);
	}

	protected static void XMLToExampleConversion() {

		// Cria um JsonObject
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);

		// Transforma o JSONObject em XML com o.toString() e imprimi
		String output = XML.toString(example);
		System.out.println("Final XML: " + output);
	}

	protected static void XMLFromExampleConversion() {

		// Cria String em foramto XML
		String string = "<0>value</0><1>5</1><2>-2.345E+68</2><3>true</3>";

		// Com o .toJSONOBject() transforma a String em JSONObject e imprimi
		JSONObject output = XML.toJSONObject(string);
		System.out.println("Final JSONObject: " + output);
	}

	protected static void CookieToExampleConversion() {

		// Inicia um JSONObject, é preciso dar um nome ao cookie e atribuir um nome ao
		// campo "nome", o formato Cokkie não aceita booleanos
		String string = "{\"name\":\"Cookie-Name\",\"value\":\"name\",\"1\":5,\"2\":-2.345E68,\"3\":'true'}";
		JSONObject example = new JSONObject(string);

		// Pega a String e transforma em Cookie a partir do .toString()
		String output = Cookie.toString(example);
		System.out.println("Final Cookie: " + output);
	}

	protected static void CookieFromExampleConversion() {

		// String no formato Cookie
		String string = "Cookie-Name=name;1=5;2=-2.345E%2b68;3=true";

		// Transforma o Cookie em JSONObject com o .toJSONOBject() e imprimi
		JSONObject output = Cookie.toJSONObject(string);
		System.out.println("Final JSONObject: " + output);
	}

	protected static void HTTPToExampleConversion() {

		// Criado uma string em formato HTTP para poder ser convertido em JSONObject
		String string = "{\"Method\":\"POST\",\"Request-URI\":'/',\"HTTP-Version\":'HTTP/1.1',\"Value1\":true,\"Value2\":2,\"Value3\":-2.345E68}";
		JSONObject example = new JSONObject(string);

		// Obtem uma String com formato HTTP com o .toString()
		String output = HTTP.toString(example);
		System.out.println("Final HTTP: " + output);
	}

	protected static void HTTPFromExampleConversion() {

		// Inicia com uma String em formato HTTP
		String string = "Final HTTP: POST '/' HTTP/1.1 Value3: -2.345E+68 Value1: true Value2: 2";

		// Pega o JSONObject a partir do .toJSONOBject()
		JSONObject output = HTTP.toJSONObject(string);
		System.out.println("Final JSONObject: " + output);
	}

	protected static void CDLToExampleConversion() {

		// Cria alguns JSONObjects mesmo valores de chaves mas valores distintos nos
		// "valores"
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);
		System.out.println(example);

		String string2 = "{\"0\":\"value2\",\"1\":6,\"2\":-8.345E68,\"3\":false}";
		JSONObject example2 = new JSONObject(string2);
		System.out.println(example2);

		// Cria um JsonArray com os JSONObjects criados acima
		JSONArray array = new JSONArray();
		array.put(example);
		array.put(example2);

		// Cria uma String em formato XML com .toString()
		String output = CDL.toString(array);
		System.out.println("Final CDL: \r\n" + output);
	}

	protected static void CDLFromExampleConversion() {

		// Cria String em formato CDL
		String string = "0,1,2,3\n" + "value,5,-2.345E+68,true\n" + "value2,6,-8.345E+68,false";

		// Transforma em JSONArray com o .toJSONOBject()

		JSONArray output = CDL.toJSONArray(string);
		System.out.println("Final JSONArray: " + output);
	}

	protected static Properties PropertyToExampleConversion() {

		// Cria um JSONObject a partir de uma String
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);

		// A partir do formato Propeties com .toString() se obtem uma String
		Properties output = Property.toProperties(example);
		System.out.println("Final Properties: " + output);

		return output;

	}

	protected static void PropertyFromExampleConversion() {

		// Chamo o objeto Propeties do método anterior
		Properties input = PropertyToExampleConversion();

		// Transforma em JSONObject com o .toJSONOBject()
		JSONObject output = Property.toJSONObject(input);
		System.out.println("Final JSONObject: " + output);
	}

}
