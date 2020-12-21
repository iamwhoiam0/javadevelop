import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class stores the basic state necessary for the A* algorithm to compute a
 * path across a map.  This state includes a collection of "open waypoints" and
 * another collection of "closed waypoints."  In addition, this class provides
 * the basic operations that the A* pathfinding algorithm needs to perform its
 * processing.
 **/
public class AStarState
{
  /** This is a reference to the map that the A* algorithm is navigating. **/
  private Map2D map;

  private HashMap<Integer, Waypoint> openWaypoints = new HashMap<>();

  private HashMap<Integer, Waypoint> closeWaypoints = new HashMap<>();


  /**
   * Initialize a new state object for the A* pathfinding algorithm to use.
   **/
  public AStarState(Map2D map)
  {
    if (map == null)
      throw new NullPointerException("map cannot be null");

    this.map = map;
  }

  /** Returns the map that the A* pathfinder is navigating. **/
  public Map2D getMap()
  {
    return map;
  }

  /**
   * This method scans through all open waypoints, and returns the waypoint
   * with the minimum total cost.  If there are no open waypoints, this method
   * returns <code>null</code>.
   **/
  public Waypoint getMinOpenWaypoint() {
    if (openWaypoints.size() == 0) return null;

    ArrayList<Waypoint> waypoints = new ArrayList<>(openWaypoints.values());
    double minCost = waypoints.get(0).getTotalCost();
    Waypoint minWaypoint = waypoints.get(0);
    int length = waypoints.size();

    for (int i = 0; i < length; i++) {
      if (waypoints.get(i).getTotalCost() < minCost) {
        minWaypoint = waypoints.get(i);
        minCost = minWaypoint.getTotalCost();
      }
    }

    return minWaypoint;
  }

  /**
   * This method adds a waypoint to (or potentially updates a waypoint already
   * in) the "open waypoints" collection.  If there is not already an open
   * waypoint at the new waypoint's location then the new waypoint is simply
   * added to the collection.  However, if there is already a waypoint at the
   * new waypoint's location, the new waypoint replaces the old one <em>only
   * if</em> the new waypoint's "previous cost" value is less than the current
   * waypoint's "previous cost" value.
   **/
  public boolean addOpenWaypoint(Waypoint newWP)
  {
    if (openWaypoints.get(newWP.getLocation().hashCode()) == null) {
      openWaypoints.put(newWP.getLocation().hashCode(), newWP);
      return false;
    } else {
      if (openWaypoints.get(newWP.getLocation().hashCode()).getPreviousCost() > newWP.getPreviousCost()) {
        openWaypoints.put(newWP.getLocation().hashCode(), newWP);
        return true;
      }
    }

    return false;
  }


  /** Returns the current number of open waypoints. **/
  public int numOpenWaypoints()
  {
    return openWaypoints.size();
  }


  /**
   * This method moves the waypoint at the specified location from the
   * open list to the closed list.
   **/
  public void closeWaypoint(int loc)
  {
    closeWaypoints.put(loc, openWaypoints.remove(loc));
  }

  /**
   * Returns true if the collection of closed waypoints contains a waypoint
   * for the specified location.
   **/
  public boolean isLocationClosed(int loc)
  {
    return closeWaypoints.containsKey(loc);
  }
}
