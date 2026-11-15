class Solution:

  def minEatingSpeed(self, piles: list[int], h: int) -> int:
    low = 1
    high = max(piles)
    min_speed = high

    while low <= high:
      mid = low + (high - low) // 2

      # Calculate total hours needed at speed 'mid'
      # Using math.ceil(pile / mid) for each pile
      total_hours = sum((pile + mid - 1) // mid for pile in piles)

      if total_hours <= h:
        min_speed = mid  # Try to find a slower valid speed
        high = mid - 1
      else:
        low = mid + 1  # Too slow, need a higher speed

    return min_speed