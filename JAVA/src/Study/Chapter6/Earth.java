package Study.Chapter6;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	static final double PI = 3.14;
	static {
		EARTH_SURFACE_AREA = 4 * PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
