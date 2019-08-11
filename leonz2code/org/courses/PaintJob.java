package leonz2code.org.courses;

public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getBucketCount(0.75,0.75, 0.5,0);
	}

	public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets) {

		if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			
			System.out.println("Invalid Value");
			return -1;
		}
		
		double area = width * height;		
		double buckets_need = area / areaPerBucket;
		double buckets_remain = buckets_need - extraBuckets;
		
		double l = Math.ceil(buckets_remain);
		
		int res = (int)l;
		
//	System.out.println("Total area: "+area);
//	System.out.println("Total area: "+buckets_need);
	System.out.println("Total area: "+res);
	
	return res;
}

	public static int getBucketCount(double width,double height,double areaPerBucket) {
		if(width <= 0 || height <= 0 || areaPerBucket <= 0 ) {
			
			System.out.println("Invalid Value");
			return -1;
		}
		
		double area = width * height;		
		double buckets_need = area / areaPerBucket;
		
		double l = Math.ceil(buckets_need);
		
		int res = (int)l;
		
//		System.out.println(l);
		
		
		return res;
	}
	
	public static int getBucketCount(double area,double areaPerBucket) {
		if(area <= 0 || areaPerBucket <= 0 ) {
			
			System.out.println("Invalid Value");
			return -1;
		}
		
		double buckets_need = area / areaPerBucket;
		double l = Math.ceil(buckets_need);
		int res = (int)l;
		
				System.out.println(res);
		return res;
		

	}


}