package dev.tindersamurai.henrychek;

import com.jcabi.github.Coordinates;
import com.jcabi.github.Release;
import com.jcabi.github.ReleaseAsset;
import com.jcabi.github.RtGithub;
import lombok.val;
import org.junit.Test;

import java.io.IOException;

public class JCabiTest {

	@Test
	public void test() throws IOException {
		val github = new RtGithub("0f4212cebdc6d258eec3d2609d52957d353d8e98");
		val repo = github.repos().get(new Coordinates.Simple("/henryco/Escapy2.0"));
		val releases = repo.releases();

		val iterator = releases.iterate().iterator();
		if (!iterator.hasNext()) throw new RuntimeException();

		val assets = iterator.next().assets().iterate().iterator();
		if (!assets.hasNext()) throw new RuntimeException();

		val downloadUrl = assets.next().json().getString("browser_download_url");
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println(downloadUrl);
	}
}
