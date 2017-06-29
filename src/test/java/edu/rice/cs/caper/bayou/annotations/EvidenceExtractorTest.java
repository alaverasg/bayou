package edu.rice.cs.caper.bayou.annotations;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import edu.rice.cs.caper.bayou.core.synthesizer.EvidenceExtractor;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EvidenceExtractorTest
{
    String testDir = "/Users/vijay/Work/bayou/src/test/resources/synthesizer";
    String classpath = "/Users/vijay/Work/bayou/tool_files/build_scripts/out/resources/artifacts/classes:/Users/vijay/Work/bayou/tool_files/build_scripts/out/resources/artifacts/jar/android.jar";

    Gson gson = new Gson();

    void testExecute(String test) throws IOException
    {
        String code = new String(Files.readAllBytes(Paths.get(String.format("%s/%s.java", testDir, test))));
        String content = new EvidenceExtractor().execute(code, classpath);

        try {
            gson.fromJson(content, Object.class); // check valid JSON
        } catch(JsonSyntaxException e) {
            Assert.fail("Invalid JSON: " + e.getMessage());
        }
    }

    @Test
    public void testIO1() throws IOException {
        testExecute("TestIO1");
    }

    @Test
    public void testIO2() throws IOException {
        testExecute("TestIO2");
    }

    @Test
    public void testBluetooth() throws IOException {
        testExecute("TestBluetooth");
    }

    @Test
    public void testDialog() throws IOException {
        testExecute("TestDialog");
    }

    @Test
    public void testCamera() throws IOException {
        testExecute("TestCamera");
    }

    @Test
    public void testWifi() throws IOException {
        testExecute("TestWifi");
    }

    @Test
    public void testSpeech() throws IOException {
        testExecute("TestSpeech");
    }
}
