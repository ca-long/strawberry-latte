export async function fetchCafeDetail(cafeID) {
    try {
        const response = await fetch(`http://localhost:8080/api/cafe/${cafeID}`);

        if (!response.ok) {
            throw new Error("Cafe not found.")
        }

        return await response.json();
    }
    catch (error) {
        console.error("Fetch Error: ", error);
        return null;
    }
}