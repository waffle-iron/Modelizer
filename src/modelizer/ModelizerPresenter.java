package modelizer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.jetbrains.jsonSchema.extension.schema.JsonSchemaRefReferenceProvider;
import okhttp3.*;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by erikrahtjen on 9/27/16.
 */
public class ModelizerPresenter implements Callback {

    View view;
    OkHttpClient okClient;

    public ModelizerPresenter(View view) {
        super();
        okClient = new OkHttpClient();
        this.view = view;
    }

    public void sendRequest(HttpVerb httpMethod, String url) {
        Request.Builder builder = new Request.Builder().url(url);
        //TODO: assemble body and headers
        RequestBody body = null;

        switch (httpMethod) {
            case GET:
                builder.get();
                break;
            case POST:
                builder.post(body);
                break;
            case PATCH:
                builder.patch(body);
                break;
            case PUT:
                builder.put(body);
                break;
            case DELETE:
                builder.delete(body);
                break;
        }

        Request request = builder.build();

        okClient.newCall(request).enqueue(this);
    }

    @Override
    public void onFailure(Call call, IOException e) {
        //TODO: handle this appropriately
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        String responseBody = response.body().string();
        view.displayBody(responseBody);
        JsonReader reader = new JsonReader(new StringReader(responseBody));
        while (reader.hasNext()) {

        }

    }

    public interface View {
        void displayBody(String s);
    }
}
